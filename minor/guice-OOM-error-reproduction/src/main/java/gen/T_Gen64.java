
  package gen;
  public class T_Gen64 {
  		@com.google.inject.Inject
  		public T_Gen64(T_Gen65 t_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  