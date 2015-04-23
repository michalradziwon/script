
  package gen;
  public class I_Gen153 {
  		@com.google.inject.Inject
  		public I_Gen153(I_Gen154 i_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  