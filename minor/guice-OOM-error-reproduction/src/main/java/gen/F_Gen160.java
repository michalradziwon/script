
  package gen;
  public class F_Gen160 {
  		@com.google.inject.Inject
  		public F_Gen160(F_Gen161 f_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  