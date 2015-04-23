
  package gen;
  public class I_Gen43 {
  		@com.google.inject.Inject
  		public I_Gen43(I_Gen44 i_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  