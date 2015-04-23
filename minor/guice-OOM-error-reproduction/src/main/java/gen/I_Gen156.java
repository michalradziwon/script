
  package gen;
  public class I_Gen156 {
  		@com.google.inject.Inject
  		public I_Gen156(I_Gen157 i_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  