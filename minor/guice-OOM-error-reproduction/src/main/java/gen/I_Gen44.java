
  package gen;
  public class I_Gen44 {
  		@com.google.inject.Inject
  		public I_Gen44(I_Gen45 i_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  