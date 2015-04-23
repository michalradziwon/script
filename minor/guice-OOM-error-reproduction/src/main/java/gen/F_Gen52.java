
  package gen;
  public class F_Gen52 {
  		@com.google.inject.Inject
  		public F_Gen52(F_Gen53 f_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  