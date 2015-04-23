
  package gen;
  public class Q_Gen72 {
  		@com.google.inject.Inject
  		public Q_Gen72(Q_Gen73 q_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  