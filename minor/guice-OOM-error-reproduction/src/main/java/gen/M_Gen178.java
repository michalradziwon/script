
  package gen;
  public class M_Gen178 {
  		@com.google.inject.Inject
  		public M_Gen178(M_Gen179 m_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  