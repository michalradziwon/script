
  package gen;
  public class O_Gen25 {
  		@com.google.inject.Inject
  		public O_Gen25(O_Gen26 o_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  