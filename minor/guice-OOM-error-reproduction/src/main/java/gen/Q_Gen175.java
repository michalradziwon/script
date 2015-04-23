
  package gen;
  public class Q_Gen175 {
  		@com.google.inject.Inject
  		public Q_Gen175(Q_Gen176 q_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  