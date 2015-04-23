
  package gen;
  public class D_Gen24 {
  		@com.google.inject.Inject
  		public D_Gen24(D_Gen25 d_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  