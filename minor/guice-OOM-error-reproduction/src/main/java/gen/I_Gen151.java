
  package gen;
  public class I_Gen151 {
  		@com.google.inject.Inject
  		public I_Gen151(I_Gen152 i_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  