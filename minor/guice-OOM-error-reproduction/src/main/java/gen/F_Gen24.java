
  package gen;
  public class F_Gen24 {
  		@com.google.inject.Inject
  		public F_Gen24(F_Gen25 f_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  