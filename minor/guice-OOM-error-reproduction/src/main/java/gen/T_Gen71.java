
  package gen;
  public class T_Gen71 {
  		@com.google.inject.Inject
  		public T_Gen71(T_Gen72 t_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  