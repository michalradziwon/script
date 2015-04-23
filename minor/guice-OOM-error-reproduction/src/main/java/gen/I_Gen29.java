
  package gen;
  public class I_Gen29 {
  		@com.google.inject.Inject
  		public I_Gen29(I_Gen30 i_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  