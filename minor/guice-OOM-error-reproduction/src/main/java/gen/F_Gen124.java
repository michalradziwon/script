
  package gen;
  public class F_Gen124 {
  		@com.google.inject.Inject
  		public F_Gen124(F_Gen125 f_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  