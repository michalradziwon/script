
  package gen;
  public class X_Gen24 {
  		@com.google.inject.Inject
  		public X_Gen24(X_Gen25 x_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  