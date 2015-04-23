
  package gen;
  public class X_Gen23 {
  		@com.google.inject.Inject
  		public X_Gen23(X_Gen24 x_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  