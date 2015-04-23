
  package gen;
  public class I_Gen5 {
  		@com.google.inject.Inject
  		public I_Gen5(I_Gen6 i_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  