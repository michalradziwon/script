
  package gen;
  public class X_Gen55 {
  		@com.google.inject.Inject
  		public X_Gen55(X_Gen56 x_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  