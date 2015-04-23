
  package gen;
  public class D_Gen23 {
  		@com.google.inject.Inject
  		public D_Gen23(D_Gen24 d_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  