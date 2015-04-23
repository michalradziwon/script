
  package gen;
  public class T_Gen175 {
  		@com.google.inject.Inject
  		public T_Gen175(T_Gen176 t_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  