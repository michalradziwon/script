
  package gen;
  public class I_Gen117 {
  		@com.google.inject.Inject
  		public I_Gen117(I_Gen118 i_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  