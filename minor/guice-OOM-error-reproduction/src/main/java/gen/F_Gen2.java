
  package gen;
  public class F_Gen2 {
  		@com.google.inject.Inject
  		public F_Gen2(F_Gen3 f_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  