
  package gen;
  public class F_Gen113 {
  		@com.google.inject.Inject
  		public F_Gen113(F_Gen114 f_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  