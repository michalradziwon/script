
  package gen;
  public class T_Gen13 {
  		@com.google.inject.Inject
  		public T_Gen13(T_Gen14 t_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  