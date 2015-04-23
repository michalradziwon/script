
  package gen;
  public class I_Gen113 {
  		@com.google.inject.Inject
  		public I_Gen113(I_Gen114 i_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  