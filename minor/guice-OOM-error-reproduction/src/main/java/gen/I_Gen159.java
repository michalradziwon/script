
  package gen;
  public class I_Gen159 {
  		@com.google.inject.Inject
  		public I_Gen159(I_Gen160 i_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  