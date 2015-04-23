
  package gen;
  public class F_Gen123 {
  		@com.google.inject.Inject
  		public F_Gen123(F_Gen124 f_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  