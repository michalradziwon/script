
  package gen;
  public class I_Gen160 {
  		@com.google.inject.Inject
  		public I_Gen160(I_Gen161 i_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  