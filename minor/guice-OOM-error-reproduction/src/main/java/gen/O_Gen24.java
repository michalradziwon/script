
  package gen;
  public class O_Gen24 {
  		@com.google.inject.Inject
  		public O_Gen24(O_Gen25 o_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  