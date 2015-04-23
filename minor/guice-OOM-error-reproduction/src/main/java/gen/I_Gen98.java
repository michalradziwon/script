
  package gen;
  public class I_Gen98 {
  		@com.google.inject.Inject
  		public I_Gen98(I_Gen99 i_gen99){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen99 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  