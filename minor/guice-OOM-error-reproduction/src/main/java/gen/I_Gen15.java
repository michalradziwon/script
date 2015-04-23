
  package gen;
  public class I_Gen15 {
  		@com.google.inject.Inject
  		public I_Gen15(I_Gen16 i_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  