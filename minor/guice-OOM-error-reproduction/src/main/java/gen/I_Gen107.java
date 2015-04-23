
  package gen;
  public class I_Gen107 {
  		@com.google.inject.Inject
  		public I_Gen107(I_Gen108 i_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  