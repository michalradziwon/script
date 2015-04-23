
  package gen;
  public class F_Gen1 {
  		@com.google.inject.Inject
  		public F_Gen1(F_Gen2 f_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  