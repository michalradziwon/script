
  package gen;
  public class Q_Gen146 {
  		@com.google.inject.Inject
  		public Q_Gen146(Q_Gen147 q_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  