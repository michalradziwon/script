
  package gen;
  public class I_Gen166 {
  		@com.google.inject.Inject
  		public I_Gen166(I_Gen167 i_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  