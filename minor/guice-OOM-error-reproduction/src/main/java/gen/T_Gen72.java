
  package gen;
  public class T_Gen72 {
  		@com.google.inject.Inject
  		public T_Gen72(T_Gen73 t_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  