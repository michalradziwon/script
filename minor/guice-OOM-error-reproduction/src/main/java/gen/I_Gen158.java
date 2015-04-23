
  package gen;
  public class I_Gen158 {
  		@com.google.inject.Inject
  		public I_Gen158(I_Gen159 i_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  