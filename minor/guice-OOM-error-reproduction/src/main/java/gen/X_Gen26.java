
  package gen;
  public class X_Gen26 {
  		@com.google.inject.Inject
  		public X_Gen26(X_Gen27 x_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  