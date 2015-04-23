
  package gen;
  public class I_Gen67 {
  		@com.google.inject.Inject
  		public I_Gen67(I_Gen68 i_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  