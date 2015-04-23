
  package gen;
  public class F_Gen117 {
  		@com.google.inject.Inject
  		public F_Gen117(F_Gen118 f_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  