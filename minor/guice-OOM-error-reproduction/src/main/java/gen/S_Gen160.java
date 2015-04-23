
  package gen;
  public class S_Gen160 {
  		@com.google.inject.Inject
  		public S_Gen160(S_Gen161 s_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  