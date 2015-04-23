
  package gen;
  public class O_Gen160 {
  		@com.google.inject.Inject
  		public O_Gen160(O_Gen161 o_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  