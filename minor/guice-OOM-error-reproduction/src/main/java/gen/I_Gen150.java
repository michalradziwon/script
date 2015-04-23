
  package gen;
  public class I_Gen150 {
  		@com.google.inject.Inject
  		public I_Gen150(I_Gen151 i_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  