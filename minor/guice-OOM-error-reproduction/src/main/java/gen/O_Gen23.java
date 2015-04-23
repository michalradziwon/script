
  package gen;
  public class O_Gen23 {
  		@com.google.inject.Inject
  		public O_Gen23(O_Gen24 o_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  