
  package gen;
  public class O_Gen129 {
  		@com.google.inject.Inject
  		public O_Gen129(O_Gen130 o_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  