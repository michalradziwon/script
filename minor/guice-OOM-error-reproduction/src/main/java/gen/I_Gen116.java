
  package gen;
  public class I_Gen116 {
  		@com.google.inject.Inject
  		public I_Gen116(I_Gen117 i_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  