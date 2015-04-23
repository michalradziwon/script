
  package gen;
  public class I_Gen13 {
  		@com.google.inject.Inject
  		public I_Gen13(I_Gen14 i_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  