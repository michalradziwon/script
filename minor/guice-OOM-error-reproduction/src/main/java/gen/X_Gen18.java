
  package gen;
  public class X_Gen18 {
  		@com.google.inject.Inject
  		public X_Gen18(X_Gen19 x_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  