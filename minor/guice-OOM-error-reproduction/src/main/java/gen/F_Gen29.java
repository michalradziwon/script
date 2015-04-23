
  package gen;
  public class F_Gen29 {
  		@com.google.inject.Inject
  		public F_Gen29(F_Gen30 f_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  