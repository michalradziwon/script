
  package gen;
  public class X_Gen193 {
  		@com.google.inject.Inject
  		public X_Gen193(X_Gen194 x_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  