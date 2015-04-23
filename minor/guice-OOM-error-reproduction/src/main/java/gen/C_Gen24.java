
  package gen;
  public class C_Gen24 {
  		@com.google.inject.Inject
  		public C_Gen24(C_Gen25 c_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  