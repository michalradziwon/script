
  package gen;
  public class X_Gen51 {
  		@com.google.inject.Inject
  		public X_Gen51(X_Gen52 x_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  